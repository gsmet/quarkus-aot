package fr.spacefox.perftests.quarkus.rest.endpoint871;

import fr.spacefox.perftests.quarkus.core.service871.model.Model871;
import fr.spacefox.perftests.quarkus.rest.endpoint871.schema.Schema871;

final class Mapper {
    private Mapper() {}

    public static Schema871 of(Model871 model) {
        return new Schema871(model.id(), model.value());
    }
}
