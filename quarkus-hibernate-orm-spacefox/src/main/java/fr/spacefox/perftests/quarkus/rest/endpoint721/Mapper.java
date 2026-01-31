package fr.spacefox.perftests.quarkus.rest.endpoint721;

import fr.spacefox.perftests.quarkus.core.service721.model.Model721;
import fr.spacefox.perftests.quarkus.rest.endpoint721.schema.Schema721;

final class Mapper {
    private Mapper() {}

    public static Schema721 of(Model721 model) {
        return new Schema721(model.id(), model.value());
    }
}
