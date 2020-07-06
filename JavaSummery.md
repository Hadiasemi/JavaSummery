---
title: JavaSummery
author: Hadi Asemi
date:
<!-- header-includes:
  - \hypersetup{colorlinks=True,
      allbordercolors={0 0 0},
      pdfborderstyle={/S/U/W 1}
    } -->


urlcolor: blue
geometry: "left=1cm,right=1cm,top=2cm,bottom=2cm"

header-includes:

- \usepackage{fancyhdr}
- \pagestyle{fancy}
- \fancyfoot{}
- \fancyhead{}
- \fancyfoot[R]{\thepage\ }
- \renewcommand{\headrulewidth}{2pt}
- \renewcommand{\footrulewidth}{2pt}
- \fancyhead[L]{CPE 203}
- \fancyhead[R]{Hadi Asemi}
- \fancyhead[C]{Java}
- \newlength\FHoffset
- \setlength\FHoffset{1cm}


---
\thispagestyle{fancy}

# Array:

```Java
int[]array= new int[20]; // allocating memory for array. it will be fixed sized
array[0]=5; //declaring first element array

//for loop - if nums is Array
for (int i = 0; i < nums.length i++){
  //nums[i];
}

//for each loop
for (int i: nums){
  //do stuff with i
}

```
# ArrayList:

```Java
ArrayList<String>words=new ArrayList<String>();
ArrayList<Integer>num=new ArrayList<int>();
num.add(1);
num.get(0); // we need put index


//for loop - if nums is ArrayList
for (int i = 0; i < nums.size(); i++){
  //nums.get(i);
}

//for each loop
for (int i: nums){
  //do stuff with i
}

```

# HashMap:

```Java
Map<String,String>myMap=new HashMap<>();

// add key
myMap.put("Hadi","21");

// get the value of the key
myMap.get("Hadi");

// remove the key
myMap.remove("Hadi");

// clear whole Map
myMap.clear();

```
