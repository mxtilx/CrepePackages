***CrepePlus currently does not support CBT3, so please follow these steps instead.***

# **Step 1**
### Download and install the Honkai: Star Rail (Beta) launcher and game [here](https://autopatchos.starrails.com/client/download/20230202113937_NE7YVwlt4XBAMuNL/StarRail_setup_20230202111955.exe). Launch the game to make sure it runs, then close it. (You don't have to sign in, obviously)

# **Step 2**
### Download and setup Fiddler Classic (file provided in the CrepePlus-beta folder.)
### If you have used Fiddler before, paste this script in the FiddlerScript tab:

## **If not**

### Top left corner -> `Tools` -> `Options` -> `HTTPS` -> `Decrypt HTTPS traffic (on)`
### To the right of `Capture HTTPS CONNECTs` -> `Actions` -> `Trust Root Certificate` -> Agree to all certs.
### Close the `Options` page, and press the `FiddlerScript` tab near the top right region.
### Then paste the script below and press `Save Script`
-----

```
import Fiddler;

const list = [".yuanshen.com", ".hoyoverse.com", ".mihoyo.com", "starrails.com", ".kurogame.com", "zenlesszonezero.com", "api.g3.proletariat.com", "west.honkaiimpact3.com"]

class Handlers {
    static function OnBeforeRequest(oS: Session) {
        for (var i = 0; i < list.length; i++) {
            if (oS.host.EndsWith(list[i])) {
                oS.host = "sr.crepe.moe"; // This can also be replaced with another IP address.
                //oS.oRequest.headers.Remove("Sec-WebSocket-Protocol");
            }

            if(oS.host.Contains("overseauspider.yuanshen.com")){
                oS.oRequest.FailSession(404, "Blocked", "your mom");
            }
        }
    }
}
```

-----

# **Step 2**
Login with any username and password and play the game