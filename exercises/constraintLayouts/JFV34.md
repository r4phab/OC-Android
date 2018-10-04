# [Exercises] ConstraintLayouts

<img src="../../art/oclogo.png" alt="drawing" width="150"/>

### Consignes :

• Chaque couleur représente une vue, la couleur de fond est le blanc.

• La vue doit pouvoir être la même sur tous les appareils ! (téléphones 5", téléphones 6", tablettes 7", tablettes 10", etc ..)

• Designer ces vues en utilisant qu'un seul ConstraintLayout et des Views à l'intérieur.

• Tous les attributs layoutwidth et layoutheight des Views doivent être à 0dp (voir exemple)

### Example :

<img src="0.png" alt="drawing" width="200"/>

### Answer :

```
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <View
        android:id="@+id/view_back"
        android:background="@color/green"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        android:layout_width="0dp"
        android:layout_height="0dp" />

    <View
        android:id="@+id/view_front"
        android:background="@color/red"
        app:layout_constraintStart_toStartOf="@+id/view_back"
        app:layout_constraintTop_toTopOf="@+id/view_back"
        app:layout_constraintEnd_toEndOf="@+id/view_back"
        app:layout_constraintBottom_toBottomOf="@+id/view_back"
        android:layout_width="0dp"
        app:layout_constraintHeight_percent="0.5"
        android:layout_height="0dp" />

</android.support.constraint.ConstraintLayout>
```

### #1
<img src="1.png" alt="drawing" width="200"/>

### Answer :

```
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <View
        android:id="@+id/view1"
        android:background="#42F46B"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintBottom_toTopOf="@+id/view3"
        app:layout_constraintEnd_toStartOf="@+id/view2"
        android:layout_width="0dp"
        android:layout_height="0dp"
        />

    <View
        android:id="@+id/view2"
        android:background="#F44245"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/view1"
        app:layout_constraintBottom_toTopOf="@+id/view4"
        android:layout_width="0dp"
        android:layout_height="0dp" />

    <View
        android:id="@+id/view3"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#F44245"
        app:layout_constraintBottom_toTopOf="@+id/view5"
        app:layout_constraintEnd_toStartOf="@+id/view4"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/view1" />

    <View
        android:id="@+id/view4"
        android:background="#42F46B"
        app:layout_constraintTop_toBottomOf="@+id/view2"
        app:layout_constraintStart_toEndOf="@+id/view3"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintBottom_toTopOf="@id/view6"
        android:layout_width="0dp"
        android:layout_height="0dp"/>

    <View
        android:id="@+id/view5"
        android:background="#42F46B"
        app:layout_constraintTop_toBottomOf="@id/view3"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/view6"
        app:layout_constraintBottom_toTopOf="@+id/view7"
        android:layout_width="0dp"
        android:layout_height="0dp" />

    <View
        android:id="@+id/view6"
        android:background="#F44245"
        app:layout_constraintTop_toBottomOf="@+id/view4"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/view5"
        app:layout_constraintBottom_toTopOf="@+id/view8"
        android:layout_width="0dp"
        android:layout_height="0dp" />

    <View
        android:id="@+id/view7"
        android:background="#F44245"
        app:layout_constraintTop_toBottomOf="@id/view5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/view8"
        app:layout_constraintBottom_toBottomOf="parent"
        android:layout_width="0dp"
        android:layout_height="0dp" />

    <View
        android:id="@+id/view8"
        android:background="#42F46B"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/view7"
        app:layout_constraintTop_toBottomOf="@+id/view6"
        android:layout_width="0dp"
        android:layout_height="0dp"/>

</android.support.constraint.ConstraintLayout>
```

### #2
<img src="2.png" alt="drawing" width="200"/>

### Answer :

```
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

     <View
        android:id="@+id/view21"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#42F46B"
        app:layout_constraintBottom_toTopOf="@+id/view22"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <View
        android:id="@+id/view22"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#F44245"
        app:layout_constraintBottom_toTopOf="@+id/view23"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/view21"
        app:layout_constraintWidth_percent="0.75" />


    <View
        android:id="@+id/view23"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#42F46B"
        app:layout_constraintBottom_toTopOf="@id/view24"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/view22"
        app:layout_constraintWidth_percent="0.75" />

    <View
        android:id="@+id/view24"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#F44245"
        app:layout_constraintBottom_toTopOf="@+id/view25"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/view23"
        app:layout_constraintWidth_percent="0.25" />

    <View
        android:id="@+id/view25"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#42F46B"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/view24"
        app:layout_constraintWidth_percent="0.25" />

</android.support.constraint.ConstraintLayout>
```

### #3

<img src="3.png" alt="drawing" width="200"/>

### Answer :

```
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <View
        android:id="@+id/view31"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#42F46B"
        app:layout_constraintBottom_toTopOf="@+id/view32"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHeight_percent="0.25"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <View
        android:id="@+id/view311"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#F44245"
        app:layout_constraintBottom_toTopOf="@id/view32"
        app:layout_constraintEnd_toStartOf="@+id/view312"
        app:layout_constraintHeight_percent="0.125"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintWidth_percent="0.25" />

    <View
        android:id="@+id/view312"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#42F46B"
        app:layout_constraintBottom_toTopOf="@id/view32"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHeight_percent="0.125"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintWidth_percent="0.25" />

    <View
        android:id="@+id/view313"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#F44245"
        app:layout_constraintBottom_toTopOf="@id/view32"
        app:layout_constraintHeight_percent="0.125"
        app:layout_constraintStart_toEndOf="@id/view312"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintWidth_percent="0.25" />


    <View
        android:id="@+id/view32"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#F44245"
        app:layout_constraintBottom_toTopOf="@+id/view33"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="1.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/view31" />

    <View
        android:id="@+id/view321"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#42F46B"
        app:layout_constraintBottom_toBottomOf="@id/view32"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHeight_percent="0.125"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="@id/view32"
        app:layout_constraintWidth_percent="0.25" />


    <View
        android:id="@+id/view33"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#42F46B"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHeight_percent="0.50"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/view32" />

</android.support.constraint.ConstraintLayout>
```

### #4

<img src="4.png" alt="drawing" width="200"/>

### Answer :

```
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <View
        android:id="@+id/view41"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#42F46B"
        app:layout_constraintHeight_percent="0.166"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintWidth_percent="0.25" />

    <View
        android:id="@+id/view42"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#F44245"
        app:layout_constraintHeight_percent="0.166"
        app:layout_constraintStart_toEndOf="@+id/view41"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintWidth_percent="0.5" />

    <View
        android:id="@+id/view43"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#42F46B"
        app:layout_constraintHeight_percent="0.166"
        app:layout_constraintStart_toEndOf="@id/view42"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintWidth_percent="0.25" />

    <View
        android:id="@+id/view44"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#F44245"
        app:layout_constraintHeight_percent="0.166"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/view41"
        app:layout_constraintWidth_percent="0.25" />

    <View
        android:id="@+id/view45"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#42F46B"
        app:layout_constraintHeight_percent="0.166"
        app:layout_constraintStart_toEndOf="@+id/view41"
        app:layout_constraintTop_toBottomOf="@+id/view41"
        app:layout_constraintWidth_percent="0.5" />

    <View
        android:id="@+id/view46"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#F44245"
        app:layout_constraintHeight_percent="0.166"
        app:layout_constraintStart_toEndOf="@id/view42"
        app:layout_constraintTop_toBottomOf="@id/view41"
        app:layout_constraintWidth_percent="0.25" />

    <View
        android:id="@+id/view47"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#42F46B"
        app:layout_constraintHeight_percent="0.33"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/view44"
        app:layout_constraintWidth_percent="0.25" />

    <View
        android:id="@+id/view48"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#F44245"
        app:layout_constraintHeight_percent="0.33"
        app:layout_constraintStart_toEndOf="@+id/view41"
        app:layout_constraintTop_toBottomOf="@id/view44"
        app:layout_constraintWidth_percent="0.5" />

    <View
        android:id="@+id/view49"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#42F46B"
        app:layout_constraintHeight_percent="0.33"
        app:layout_constraintStart_toEndOf="@id/view42"
        app:layout_constraintTop_toBottomOf="@id/view44"
        app:layout_constraintWidth_percent="0.25" />

    <View
        android:id="@+id/view499"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#F44245"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/view47" />

</android.support.constraint.ConstraintLayout>
```

### #5

<img src="5.png" alt="drawing" width="200"/>

### Answer :

```
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <View
        android:id="@+id/view51"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#42F46B"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHeight_percent="0.5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <View
        android:id="@+id/view52"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#F44245"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHeight_percent="0.5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/view51" />

    <View
        android:id="@+id/view511"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#F44245"
        app:layout_constraintBottom_toBottomOf="@id/view51"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHeight_percent="0.25"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintWidth_percent="0.50" />

    <View
        android:id="@+id/view521"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#42F46B"
        app:layout_constraintBottom_toTopOf="@+id/view522"
        app:layout_constraintHeight_percent="0.125"
        app:layout_constraintStart_toEndOf="@+id/view522"
        app:layout_constraintWidth_percent="0.25" />


    <View
        android:id="@+id/view522"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#42F46B"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintHeight_percent="0.25"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintWidth_percent="0.50" />

</android.support.constraint.ConstraintLayout>
```
