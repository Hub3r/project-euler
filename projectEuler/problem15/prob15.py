import scipy.special

def LatticePaths(n,m):
    #according to wikipedia the lattice path calculation is
    #the binomial coffecient of (n+k, k)
    print(int(scipy.special.binom(n+m,n)))

#starting at 0,0 this program accepts a another coordinate n,k
#to calculate the amount of lattice paths 
LatticePaths(20,20)