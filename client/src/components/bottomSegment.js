import React from "react";
import { Segment, Header, Button } from "semantic-ui-react";
import  "../App.css";

export default class BottomSegment extends React.Component {

    render() {
       
        return (
               <Segment floated="left" className="bottomSection">
                   <Header as='h4' dividing className="msgHeader">
                       Write a message 
                    </Header>
                    <Button content='Write message' icon='mail outline' labelPosition='left' className="msgBtn" />
               </Segment>
        );
    }
}