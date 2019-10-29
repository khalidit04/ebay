import React from "react";
import { Icon, Label, Container, Segment } from "semantic-ui-react";
import  "../App.css";
import RightSegment from "./rightSegment";
import LeftSegment from "./leftSegment";
import BottomSegment from "./bottomSegment";
import Contact from "./contact";

export default class DetailsPage extends React.Component {

    constructor(props){
        super(props);
    }

    render() {
       
        return (
                <div className="container">
                    <Label className="topBtn">
                        <Icon size="big" className="backBtn" name='long arrow alternate left' />
                        Back to result page
                    </Label>
                    <Container className="detailSection" fluid>
                        <LeftSegment/>
                        <RightSegment/>
                        <BottomSegment/>
                        <Contact/>
                    </Container>
                </div>
        );
    }
}