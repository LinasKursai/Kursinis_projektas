# Automation tests for www.zvejys.lt

## Site used for testing  :   [Žvejys](https://zvejys.lt/)
### 


## Tests:
Google Chrome Version 122.0.6261.94 is used

1. Try logging in using valid email and password:
* click button "MANO PASKYRA";
* click button "PRISIJUNGTI";
* enter valid email address;
* enter valid password;
* click button "PRISIJUNGTI";
* If login is successful, the email of the connected account is scanned.

2. Try logging in using valid email and wrong password:
* click button "MANO PASKYRA";
* click button "PRISIJUNGTI";
* enter valid email address;
* enter wrong password;
* click button "PRISIJUNGTI";
* If login is not successful, read (capture) the error message.

3. Try changing account information:
* click button "MANO PASKYRA";
* click button "PRISIJUNGTI";
* enter valid email address;
* enter valid password;
* click button "PRISIJUNGTI";
* click button "Asmeninė Informacija";
* delete information from "ADRESAS" box;
* enter new address to "ADRESAS" box;
* click button "SAUGOTI/TĘSTI";
* read message that information is changed.

4. Try testing search box:
* enter selected item name;
* click on search button;
* capture the name of the found product and compare it with requested item from the task.

5. Test shopping cart:
* add reel product to cart;
* disable notification;
* navigate to fishing rod menu;
* select fishing rod and add it to the cart;
* disable notification;
* click on "MANO KREPŠELIS";
* read the list of cart items and compare it with the items requested from the task.
