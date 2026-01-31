package fr.spacefox.perftests.quarkus.rest.endpoint209;

import fr.spacefox.perftests.quarkus.core.service209.model.Model209;
import fr.spacefox.perftests.quarkus.rest.endpoint209.schema.Schema209;

final class Mapper {
    private Mapper() {}

    public static Schema209 of(Model209 model) {
        return new Schema209(model.id(), model.value());
    }
}
