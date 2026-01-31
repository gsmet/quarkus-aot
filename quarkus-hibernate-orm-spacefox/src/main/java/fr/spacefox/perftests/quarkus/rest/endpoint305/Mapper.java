package fr.spacefox.perftests.quarkus.rest.endpoint305;

import fr.spacefox.perftests.quarkus.core.service305.model.Model305;
import fr.spacefox.perftests.quarkus.rest.endpoint305.schema.Schema305;

final class Mapper {
    private Mapper() {}

    public static Schema305 of(Model305 model) {
        return new Schema305(model.id(), model.value());
    }
}
