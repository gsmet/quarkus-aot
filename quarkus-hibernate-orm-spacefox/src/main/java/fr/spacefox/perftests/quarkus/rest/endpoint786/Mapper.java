package fr.spacefox.perftests.quarkus.rest.endpoint786;

import fr.spacefox.perftests.quarkus.core.service786.model.Model786;
import fr.spacefox.perftests.quarkus.rest.endpoint786.schema.Schema786;

final class Mapper {
    private Mapper() {}

    public static Schema786 of(Model786 model) {
        return new Schema786(model.id(), model.value());
    }
}
