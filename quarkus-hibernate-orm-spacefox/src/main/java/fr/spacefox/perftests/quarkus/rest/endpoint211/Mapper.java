package fr.spacefox.perftests.quarkus.rest.endpoint211;

import fr.spacefox.perftests.quarkus.core.service211.model.Model211;
import fr.spacefox.perftests.quarkus.rest.endpoint211.schema.Schema211;

final class Mapper {
    private Mapper() {}

    public static Schema211 of(Model211 model) {
        return new Schema211(model.id(), model.value());
    }
}
