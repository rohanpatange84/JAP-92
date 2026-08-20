int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(num==sum){
            System.out.println("Perfect Numbers");
        }
        else
        System.out.println("Not Perfect Numbers");