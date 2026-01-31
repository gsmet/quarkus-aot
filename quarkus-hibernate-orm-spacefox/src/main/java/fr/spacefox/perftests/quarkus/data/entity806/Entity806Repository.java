package fr.spacefox.perftests.quarkus.data.entity806;

import fr.spacefox.perftests.quarkus.core.port.data.Entity806DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service806.model.Model806;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity806Repository implements Entity806DatasourcePort, PanacheRepository<Entity806> {
    @Override
    public Optional<Model806> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
