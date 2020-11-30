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
        android:id="@+id/view_back1"
        android:background="@color/green"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHeight_percent="0.25"
        android:layout_width="0dp"
        android:layout_height="0dp" />

    <View
        android:id="@+id/view_front"
        android:background="@color/red"
        app:layout_constraintStart_toStartOf="@+id/view_back1"
        app:layout_constraintTop_toBottomOf="@+id/view_back1"
        app:layout_constraintEnd_toEndOf="@+id/view_back1"
        app:layout_constraintBottom_toTopOf="@+id/view_back2"
        android:layout_width="0dp"
        app:layout_constraintHeight_percent="0.5"
        android:layout_height="0dp" />
        
        <View
        android:id="@+id/view_back2"
        android:background="@color/green"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintHeight_percent="0.25"
        android:layout_width="0dp"
        android:layout_height="0dp" />

</android.support.constraint.ConstraintLayout>
```

### #1
<img src="1.png" alt="drawing" width="200"/>

```
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

      <View
            android:id="@+id/view_back1"
            android:background="@android:color/holo_green_light"
            app:layout_constraintStart_toStartOf="0"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintEnd_toEndOf="0.50"
            app:layout_constraintWidth_percent="0.50"
            app:layout_constraintHeight_percent="0.25"
            android:layout_width="0dp"
            android:layout_height="0dp"
            />

        <View
            android:id="@+id/view_front"
            android:background="@android:color/holo_red_dark"
            app:layout_constraintStart_toStartOf="0.50"
            app:layout_constraintTop_toBottomOf="@id/view_back1"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintBottom_toTopOf="parent"
            android:layout_width="0dp"
            app:layout_constraintWidth_percent="0.50"
            app:layout_constraintHeight_percent="0.25"
            android:layout_height="0dp" />

        <View
            android:id="@+id/view_back2"
            android:background="@android:color/holo_red_dark"
            app:layout_constraintStart_toStartOf="@+id/view_back1"
            app:layout_constraintTop_toBottomOf="@+id/view_back1"
            app:layout_constraintWidth_percent="0.50"
            app:layout_constraintHeight_percent="0.25"
            android:layout_width="0dp"
            android:layout_height="0dp" />

        <View
            android:id="@+id/view_back3"
            android:background="@android:color/holo_green_light"
            app:layout_constraintStart_toStartOf="@+id/view_front"
            app:layout_constraintTop_toBottomOf="@+id/view_front"
            app:layout_constraintWidth_percent="0.50"
            app:layout_constraintHeight_percent="0.25"
            android:layout_width="0dp"
            android:layout_height="0dp" />

        <View
            android:id="@+id/view_back4"
            android:background="@android:color/holo_green_light"
            app:layout_constraintStart_toStartOf="@+id/view_back2"
            app:layout_constraintTop_toBottomOf="@+id/view_back2"
            app:layout_constraintWidth_percent="0.50"
            app:layout_constraintHeight_percent="0.25"
            android:layout_width="0dp"
            android:layout_height="0dp" />

        <View
            android:id="@+id/view_back5"
            android:background="@android:color/holo_red_dark"
            app:layout_constraintStart_toStartOf="@+id/view_back3"
            app:layout_constraintTop_toBottomOf="@+id/view_back3"
            app:layout_constraintWidth_percent="0.50"
            app:layout_constraintHeight_percent="0.25"
            android:layout_width="0dp"
            android:layout_height="0dp" />

        <View
            android:id="@+id/view_back6"
            android:background="@android:color/holo_red_dark"
            app:layout_constraintTop_toBottomOf="@+id/view_back4"
            app:layout_constraintWidth_percent="0.50"
            app:layout_constraintHeight_percent="0.25"
            android:layout_width="0dp"
            android:layout_height="0dp" />

        <View
            android:id="@+id/view_back7"
            android:background="@android:color/holo_green_light"
            app:layout_constraintStart_toStartOf="@+id/view_back5"
            app:layout_constraintTop_toBottomOf="@+id/view_back5"
            app:layout_constraintWidth_percent="0.50"
            app:layout_constraintHeight_percent="0.25"
            android:layout_width="0dp"
            android:layout_height="0dp" />

</android.support.constraint.ConstraintLayout>
```

### #2
<img src="2.png" alt="drawing" width="200"/>

```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

          <View
                    android:id="@+id/view_back1"
                    android:background="@android:color/holo_green_light"
                    app:layout_constraintStart_toStartOf="0"
                    app:layout_constraintTop_toTopOf="parent"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintHeight_percent="0.25"
                    android:layout_width="0dp"
                    android:layout_height="0dp"
                    />


                <View
                    android:id="@+id/view_back2"
                    android:background="@android:color/holo_red_dark"
                    app:layout_constraintStart_toStartOf="@+id/view_back1"
                    app:layout_constraintTop_toBottomOf="@+id/view_back1"
                    app:layout_constraintWidth_percent="0.75"
                    app:layout_constraintHeight_percent="0.25"
                    android:layout_width="0dp"
                    android:layout_height="0dp" />

                <View
                    android:id="@+id/view_back3"
                    android:background="@android:color/holo_green_light"
                    app:layout_constraintTop_toBottomOf="@+id/view_back2"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintWidth_percent="0.75"
                    app:layout_constraintHeight_percent="0.25"
                    android:layout_width="0dp"
                    android:layout_height="0dp" />

                <View
                    android:id="@+id/view_back4"
                    android:background="@android:color/holo_red_dark"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@+id/view_back3"
                    app:layout_constraintWidth_percent="0.25"
                    app:layout_constraintHeight_percent="0.125"
                    android:layout_width="0dp"
                    android:layout_height="0dp" />

                <View
                    android:id="@+id/view_back5"
                    android:background="@android:color/holo_green_light"
                    app:layout_constraintTop_toBottomOf="@+id/view_back4"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintWidth_percent="0.25"
                    app:layout_constraintHeight_percent="0.125"
                    android:layout_width="0dp"
                    android:layout_height="0dp" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

### #3
<img src="3.png" alt="drawing" width="200"/>

```
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

            <View
                    android:id="@+id/view_back1"
                    android:background="@android:color/holo_green_light"
                    app:layout_constraintStart_toStartOf="0"
                    app:layout_constraintTop_toTopOf="parent"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintHeight_percent="0.25"
                    android:layout_width="0dp"
                    android:layout_height="0dp"
                    />

                <View
                    android:id="@+id/view_back11"
                    android:background="@android:color/holo_red_dark"
                    app:layout_constraintEnd_toStartOf="@id/view_back21"
                    app:layout_constraintTop_toTopOf="parent"
                    app:layout_constraintBottom_toTopOf="@id/view_back2"
                    app:layout_constraintHeight_percent="0.125"
                    app:layout_constraintWidth_percent="0.25"
                    android:layout_width="0dp"
                    android:layout_height="0dp"
                    />

                <View
                    android:id="@+id/view_back12"
                    android:background="@android:color/holo_red_dark"
                    app:layout_constraintStart_toEndOf="@id/view_back21"
                    app:layout_constraintTop_toTopOf="parent"
                    app:layout_constraintBottom_toTopOf="@id/view_back2"
                    app:layout_constraintHeight_percent="0.125"
                    app:layout_constraintWidth_percent="0.25"
                    android:layout_width="0dp"
                    android:layout_height="0dp"
                    />

                <View
                    android:id="@+id/view_back2"
                    android:background="@android:color/holo_red_dark"
                    app:layout_constraintStart_toStartOf="0.25"
                    app:layout_constraintTop_toBottomOf="@id/view_back1"
                    app:layout_constraintWidth_percent="100"
                    app:layout_constraintHeight_percent="0.25"
                    android:layout_width="0dp"
                    android:layout_height="0dp" />

                <View
                    android:id="@+id/view_back21"
                    android:background="@android:color/holo_green_light"
                    app:layout_constraintBottom_toTopOf="@id/view_back3"
                    app:layout_constraintTop_toBottomOf="@id/view_back1"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintHeight_percent="0.125"
                    app:layout_constraintWidth_percent="0.25"
                    android:layout_width="0dp"
                    android:layout_height="0dp"
                    />

                <View
                    android:id="@+id/view_back3"
                    android:background="@android:color/holo_green_light"
                    app:layout_constraintStart_toStartOf="0.25"
                    app:layout_constraintTop_toBottomOf="@id/view_back2"
                    app:layout_constraintWidth_percent="1"
                    app:layout_constraintHeight_percent="0.50"
                    android:layout_width="0dp"
                    android:layout_height="0dp" />

</android.support.constraint.ConstraintLayout>
```

### #4
<img src="4.png" alt="drawing" width="200"/>

```
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

  <View
        android:id="@+id/view_back1"
        android:background="@android:color/holo_green_light"
        app:layout_constraintStart_toStartOf="0"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHeight_percent="0.25"
        android:layout_width="0dp"
        android:layout_height="0dp"
        />

    <View
        android:id="@+id/view_back11"
        android:background="@android:color/holo_red_dark"
        app:layout_constraintStart_toStartOf="@id/view_back1"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHeight_percent="0.125"
        app:layout_constraintWidth_percent="0.50"
        android:layout_width="0dp"
        android:layout_height="0dp"
        />
    <View
        android:id="@+id/view_back12"
        android:background="@android:color/holo_red_dark"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/view_back11"
        app:layout_constraintHeight_percent="0.125"
        app:layout_constraintWidth_percent="0.25"
        android:layout_width="0dp"
        android:layout_height="0dp"
        />
    <View
        android:id="@+id/view_back13"
        android:background="@android:color/holo_red_dark"
        app:layout_constraintTop_toBottomOf="@+id/view_back11"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHeight_percent="0.125"
        app:layout_constraintWidth_percent="0.25"
        android:layout_width="0dp"
        android:layout_height="0dp"
        />

    <View
        android:id="@+id/view_back2"

        app:layout_constraintTop_toBottomOf="@+id/view_back1"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHeight_percent="0.125"
        app:layout_constraintWidth_percent="1"
        android:layout_width="0dp"
        android:layout_height="0dp"
        />

    <View
        android:id="@+id/view_back3"
        android:background="@android:color/holo_green_light"
        app:layout_constraintTop_toBottomOf="@+id/view_back2"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHeight_percent="0.25"
        app:layout_constraintWidth_percent="1"
        android:layout_width="0dp"
        android:layout_height="0dp"
        />

    <View
        android:id="@+id/view_back4"
        android:background="@android:color/holo_red_dark"
        app:layout_constraintTop_toBottomOf="@+id/view_back2"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHeight_percent="0.25"
        app:layout_constraintWidth_percent="0.50"
        android:layout_width="0dp"
        android:layout_height="0dp"
        />

    <View
        android:id="@+id/view_back5"

        app:layout_constraintTop_toBottomOf="@+id/view_back3"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHeight_percent="0.125"
        app:layout_constraintWidth_percent="1"
        android:layout_width="0dp"
        android:layout_height="0dp"
        />

    <View
        android:id="@+id/view_back6"
        android:background="@android:color/holo_red_dark"
        app:layout_constraintTop_toBottomOf="@+id/view_back5"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHeight_percent="0.25"
        app:layout_constraintWidth_percent="1"
        android:layout_width="0dp"
        android:layout_height="0dp"
        />

</android.support.constraint.ConstraintLayout>
```

### #5
<img src="5.png" alt="drawing" width="200"/>

```

     <?xml version="1.0" encoding="utf-8"?>
     <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
         xmlns:app="http://schemas.android.com/apk/res-auto"
         xmlns:tools="http://schemas.android.com/tools"
         android:layout_width="match_parent"
         android:layout_height="match_parent"
         tools:context=".MainActivity">

         <View
             android:id="@+id/view_back1"
             android:background="@android:color/holo_green_light"
             app:layout_constraintStart_toStartOf="0"
             app:layout_constraintTop_toTopOf="parent"
             app:layout_constraintEnd_toEndOf="parent"
             app:layout_constraintHeight_percent="0.50"
             android:layout_width="0dp"
             android:layout_height="0dp"
             />

         <View
             android:id="@+id/view_back11"
             android:background="@android:color/holo_red_dark"
             app:layout_constraintStart_toStartOf="0"
             app:layout_constraintTop_toTopOf="parent"
             app:layout_constraintEnd_toEndOf="parent"
             app:layout_constraintBottom_toTopOf="@id/view_back2"
             app:layout_constraintWidth_percent="0.50"
             app:layout_constraintHeight_percent="0.25"
             android:layout_width="0dp"
             android:layout_height="0dp"
             />



         <View
             android:id="@+id/view_back2"
             android:background="@android:color/holo_red_dark"
             app:layout_constraintStart_toStartOf="parent"
             app:layout_constraintHeight_percent="0.25"
             app:layout_constraintTop_toBottomOf="@+id/view_back1"
             app:layout_constraintEnd_toEndOf="parent"
             android:layout_width="0dp"
             android:layout_height="0dp"
             />


         <View
             android:id="@+id/view_back4"
             android:background="@android:color/holo_red_dark"
             app:layout_constraintStart_toStartOf="@+id/view_back2"
             app:layout_constraintTop_toBottomOf="@+id/view_back2"
             app:layout_constraintWidth_percent=""
             app:layout_constraintHeight_percent="0.25"
             android:layout_width="0dp"
             android:layout_height="0dp" />

         <View
             android:id="@+id/view_back6"
             android:background="@android:color/holo_green_light"
             app:layout_constraintBottom_toTopOf="@id/view_back5"
             app:layout_constraintStart_toEndOf="@id/view_back5"
             app:layout_constraintWidth_percent="0.25"
             app:layout_constraintHeight_percent="0.125"
             android:layout_width="0dp"
             android:layout_height="0dp" />

         <View
             android:id="@+id/view_back5"
             android:background="@android:color/holo_green_light"
             app:layout_constraintStart_toStartOf="@+id/view_back2"
             app:layout_constraintTop_toBottomOf="@+id/view_back2"
             app:layout_constraintWidth_percent="0.50"
             app:layout_constraintHeight_percent="0.25"
             android:layout_width="0dp"
             android:layout_height="0dp" />




     </androidx.constraintlayout.widget.ConstraintLayout>


    

</android.support.constraint.ConstraintLayout>
```
