bool isPalindrome(int x) {
    long rem=0,rev=0,m=0;
    m=x;
    while(x>0){
        rem=x%10;
        rev=rev*10+rem;
        x/=10;
    }
    if(m==rev && m>=0){
        return true;
    }
    else
    {
        return false;
    }
    
}