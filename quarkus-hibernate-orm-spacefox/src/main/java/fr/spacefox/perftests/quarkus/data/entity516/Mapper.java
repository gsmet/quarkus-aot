package fr.spacefox.perftests.quarkus.data.entity516;

import fr.spacefox.perftests.quarkus.core.service516.model.Model516;

final class Mapper {
    private Mapper() {}

    public static Model516 of(Entity516 entity) {
        return new Model516(entity.getId(), entity.getField());
    }
}
