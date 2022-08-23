import { BrowserView, MobileView } from 'react-device-detect'
const Main = () => {


  return (
    <div>
      <BrowserView>
        <h1>PC</h1>
      </BrowserView>
      <MobileView>
        <h1>Mobile</h1>
			</MobileView>
    </div>
  );
};

export default Main;