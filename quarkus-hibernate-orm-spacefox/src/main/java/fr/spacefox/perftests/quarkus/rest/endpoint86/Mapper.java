package fr.spacefox.perftests.quarkus.rest.endpoint86;

import fr.spacefox.perftests.quarkus.core.service86.model.Model86;
import fr.spacefox.perftests.quarkus.rest.endpoint86.schema.Schema86;

final class Mapper {
    private Mapper() {}

    public static Schema86 of(Model86 model) {
        return new Schema86(model.id(), model.value());
    }
}
