package fr.spacefox.perftests.quarkus.rest.endpoint695;

import fr.spacefox.perftests.quarkus.core.service695.model.Model695;
import fr.spacefox.perftests.quarkus.rest.endpoint695.schema.Schema695;

final class Mapper {
    private Mapper() {}

    public static Schema695 of(Model695 model) {
        return new Schema695(model.id(), model.value());
    }
}
