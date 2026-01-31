package fr.spacefox.perftests.quarkus.rest.endpoint594;

import fr.spacefox.perftests.quarkus.core.service594.model.Model594;
import fr.spacefox.perftests.quarkus.rest.endpoint594.schema.Schema594;

final class Mapper {
    private Mapper() {}

    public static Schema594 of(Model594 model) {
        return new Schema594(model.id(), model.value());
    }
}
