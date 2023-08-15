# i m p o r t t h e n e c e s s a r y p a c k a g e s2 from t e n s o r f l o w . k e r a s . p r e p r o c e s s i n g . image i m p o r t I m a g e D a t a G e n e r a t o r
from t e n s o r f l o w . k e r a s . a p p l i c a t i o n s i m p o r t MobileNetV2
from t e n s o r f l o w . k e r a s . l a y e r s i m p o r t AveragePooling2D
from t e n s o r f l o w . k e r a s . l a y e r s i m p o r t Dropout
from t e n s o r f l o w . k e r a s . l a y e r s i m p o r t F l a t t e n
from t e n s o r f l o w . k e r a s . l a y e r s i m p o r t Dense
from t e n s o r f l o w . k e r a s . l a y e r s i m p o r t I n p u t
from t e n s o r f l o w . k e r a s . models i m p o r t Model
from t e n s o r f l o w . k e r a s . o p t i m i z e r s i m p o r t Adam
from t e n s o r f l o w . k e r a s . a p p l i c a t i o n s . m o b i l e n e t v 2 i m p o r t p r e p r o c e s s i n p u t
from t e n s o r f l o w . k e r a s . p r e p r o c e s s i n g . image i m p o r t i m g t o a r r a y
from t e n s o r f l o w . k e r a s . p r e p r o c e s s i n g . image i m p o r t l o a d i m g
from t e n s o r f l o w . k e r a s . u t i l s i m p o r t t o c a t e g o r i c a l
from s k l e a r n . p r e p r o c e s s i n g i m p o r t L a b e l B i n a r i z e r
from s k l e a r n . m o d e l s e l e c t i o n i m p o r t t r a i n t e s t s p l i t
from s k l e a r n . m e t r i c s i m p o r t c l a s s i f i c a t i o n r e p o r t
from i m u t i l s i m p o r t p a t h s
i m p o r t m a t p l o t l i b . p y p l o t as p l t
i m p o r t numpy as np
i m p o r t os

# i n i t i a l i z e t h e i n i t i a l l e a r n i n g r a t e , number of epochs t o t r a i n f o r ,
# and b a t c h s i z e
INIT LR = 1e −4
EPOCHS = 20
BS = 32

DIRECTORY = r ”C:\ Mask D e t e c t i o n \CODE\Face −Mask− D e t e c t i o n −m a s t e r \ d a t a s e t ”
CATEGORIES = [ ” with mask ” , ” w i t h o u t m a s k ” ]

# gr ab t h e l i s t of images i n our d a t a s e t d i r e c t o r y , t h e n i n i t i a l i z e
# t h e l i s t of d a t a ( i . e . , images ) and c l a s s images
p r i n t ( ” [INFO ] l o a d i n g images . . . ” )


d a t a = [ ]
l a b e l s = [ ]
f o r c a t e g o r y i n CATEGORIES :
p a t h = os . p a t h . j o i n (DIRECTORY, c a t e g o r y )
f o r img i n os . l i s t d i r ( p a t h ) :
42 i m g p a t h = os . p a t h . j o i n ( path , img )
image = l o a d i m g ( img path , t a r g e t s i z e =(224 , 224) )
image = i m g t o a r r a y ( image )
image = p r e p r o c e s s i n p u t ( image )

d a t a . append ( image )
l a b e l s . append ( c a t e g o r y )

# perform one − h o t e n c o d i n g on t h e l a b e l s
l b = L a b e l B i n a r i z e r ( )
l a b e l s = l b . f i t t r a n s f o r m ( l a b e l s )
l a b e l s = t o c a t e g o r i c a l ( l a b e l s )

d a t a = np . a r r a y ( data , d t y p e =” f l o a t 3 2 ” )
l a b e l s = np . a r r a y ( l a b e l s )

( t r a i n X , t e s t X , t r a i n Y , t e s t Y ) = t r a i n t e s t s p l i t ( data , l a b e l s ,
t e s t s i z e = 0 . 2 0 , s t r a t i f y = l a b e l s , r a n d o m s t a t e =42)

# c o n s t r u c t t h e t r a i n i n g image g e n e r a t o r f o r d a t a a u g m e n t a t i o n
aug = I m a g e D a t a G e n e r a t o r (
r o t a t i o n r a n g e =20 ,
zoom range = 0 . 1 5 ,
w i d t h s h i f t r a n g e = 0 . 2 ,
h e i g h t s h i f t r a n g e = 0 . 2 ,
s h e a r r a n g e = 0 . 1 5 ,
h o r i z o n t a l f l i p =True ,
f i l l m o d e =” n e a r e s t ” )
# l o a d t h e MobileNetV2 network , e n s u r i n g t h e head FC l a y e r s e t s a r e
# l e f t o f f
baseModel = MobileNetV2 ( w e i g h t s =” i m a g e n e t ” , i n c l u d e t o p = F a l s e ,
i n p u t t e n s o r = I n p u t ( shape =(224 , 224 , 3) ) )

# c o n s t r u c t t h e head of t h e model t h a t w i l l be p l a c e d on t o p of t h e
# t h e ba s e model
headModel = baseModel . o u t p u t
headModel = AveragePooling2D ( p o o l s i z e = ( 7 , 7) ) ( headModel )
headModel = F l a t t e n ( name=” f l a t t e n ” ) ( headModel )
headModel = Dense ( 1 2 8 , a c t i v a t i o n =” r e l u ” ) ( headModel )
headModel = Dropout ( 0 . 5 ) ( headModel )
adModel = Dense ( 2 , a c t i v a t i o n =” softmax ” ) ( headModel )
p l a c e t h e head FC model on t o p of t h e b as e model ( t h i s w i l l become

# t h e a c t u a l model we w i l l t r a i n )
model = Model ( i n p u t s =baseModel . i n p u t , o u t p u t s =headModel )

# l oo p ov e r a l l l a y e r s i n t h e ba s e model and f r e e z e them so t h e y w i l l
# * n o t * be u p d a t e d d u r i n g t h e f i r s t t r a i n i n g p r o c e s s
f o r l a y e r i n baseModel . l a y e r s :
l a y e r . t r a i n a b l e = F a l s e

# compile our model
p r i n t ( ” [INFO ] c o m p i l i n g model . . . ” )
o p t = Adam ( l r =INIT LR , decay =INIT LR / EPOCHS)
model . compile ( l o s s =” b i n a r y c r o s s e n t r o p y ” , o p t i m i z e r =opt ,
m e t r i c s =[ ” a c c u r a c y ” ] )

# t r a i n t h e head of t h e network
p r i n t ( ” [INFO ] t r a i n i n g head . . . ” )
H = model . f i t (
aug . flow ( t r a i n X , t r a i n Y , b a t c h s i z e =BS ) ,
s t e p s p e r e p o c h = l e n ( t r a i n X ) / / BS ,
v a l i d a t i o n d a t a =( t e s t X , t e s t Y ) ,
v a l i d a t i o n s t e p s = l e n ( t e s t X ) / / BS ,
epochs =EPOCHS)

# make p r e d i c t i o n s on t h e t e s t i n g s e t
p r i n t ( ” [INFO ] e v a l u a t i n g network . . . ” )
p r e d I d x s = model . p r e d i c t ( t e s t X , b a t c h s i z e =BS )

# f o r each image i n t h e t e s t i n g s e t we need t o f i n d t h e i n d e x of t h e
# l a b e l wit h c o r r e s p o n d i n g l a r g e s t p r e d i c t e d p r o b a b i l i t y
p r e d I d x s = np . argmax ( p r e d I d x s , a x i s =1)

# show a n i c e l y f o r m a t t e d c l a s s i f i c a t i o n r e p o r t
p r i n t ( c l a s s i f i c a t i o n r e p o r t ( t e s t Y . argmax ( a x i s =1) , p r e d I d x s ,
t a r g e t n a m e s = l b . c l a s s e s ) )

# s e r i a l i z e t h e model t o d i s k
p r i n t ( ” [INFO ] s a v i n g mask d e t e c t o r model . . . ” )
model . s a ve ( ” m a s k d e t e c t o r . model ” , s a v e f o r m a t =” h5 ” )
# p l o t t h e t r a i n i n g l o s s and a c c u r a c y
N = EPOCHS
p l t . s t y l e . use ( ” g g p l o t ” )
p l t . f i g u r e ( )
p l t . p l o t ( np . a r a n g e ( 0 , N) , H. h i s t o r y [ ” l o s s ” ] , l a b e l =” t r a i n l o s s ” )
p l t . p l o t ( np . a r a n g e ( 0 , N) , H. h i s t o r y [ ” v a l l o s s ” ] , l a b e l =” v a l l o s s ” )
p l t . p l o t ( np . a r a n g e ( 0 , N) , H. h i s t o r y [ ” a c c u r a c y ” ] , l a b e l =” t r a i n a c c ” )
p l t . p l o t ( np . a r a n g e ( 0 , N) , H. h i s t o r y [ ” v a l a c c u r a c y ” ] , l a b e l =” v a l a c c ” )
p l t . t i t l e ( ” T r a i n i n g Loss and Accuracy ” )
p l t . x l a b e l ( ”Epoch # ” )
p l t . y l a b e l ( ” Loss / Accuracy ” )

p l t . l e g e n d ( l o c =” lower l e f t ” )
p l t . s a v e f i g ( ” p l o t . png ” )