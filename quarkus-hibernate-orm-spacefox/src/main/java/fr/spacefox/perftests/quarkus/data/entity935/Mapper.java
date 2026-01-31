package fr.spacefox.perftests.quarkus.data.entity935;

import fr.spacefox.perftests.quarkus.core.service935.model.Model935;

final class Mapper {
    private Mapper() {}

    public static Model935 of(Entity935 entity) {
        return new Model935(entity.getId(), entity.getField());
    }
}
