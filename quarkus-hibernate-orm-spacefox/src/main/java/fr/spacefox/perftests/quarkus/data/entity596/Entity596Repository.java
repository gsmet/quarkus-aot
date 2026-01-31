package fr.spacefox.perftests.quarkus.data.entity596;

import fr.spacefox.perftests.quarkus.core.port.data.Entity596DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service596.model.Model596;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity596Repository implements Entity596DatasourcePort, PanacheRepository<Entity596> {
    @Override
    public Optional<Model596> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
