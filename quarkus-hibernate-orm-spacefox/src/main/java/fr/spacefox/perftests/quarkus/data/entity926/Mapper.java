package fr.spacefox.perftests.quarkus.data.entity926;

import fr.spacefox.perftests.quarkus.core.service926.model.Model926;

final class Mapper {
    private Mapper() {}

    public static Model926 of(Entity926 entity) {
        return new Model926(entity.getId(), entity.getField());
    }
}
