package fr.spacefox.perftests.quarkus.rest.endpoint738;

import fr.spacefox.perftests.quarkus.core.service738.model.Model738;
import fr.spacefox.perftests.quarkus.rest.endpoint738.schema.Schema738;

final class Mapper {
    private Mapper() {}

    public static Schema738 of(Model738 model) {
        return new Schema738(model.id(), model.value());
    }
}
