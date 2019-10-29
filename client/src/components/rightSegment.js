import React from "react";
import { Segment, Button } from "semantic-ui-react";
import  "../App.css";

export default class RightSegment extends React.Component {

    render() {
       
        return (
               <Segment floated="left" className="rightSection">
                   <Button content='Write message' icon='mail outline' labelPosition='left' className="msgBtn" />
               </Segment>
        );
    }
}