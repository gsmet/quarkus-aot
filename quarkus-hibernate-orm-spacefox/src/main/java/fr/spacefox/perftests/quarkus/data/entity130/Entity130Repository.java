package fr.spacefox.perftests.quarkus.data.entity130;

import fr.spacefox.perftests.quarkus.core.port.data.Entity130DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service130.model.Model130;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity130Repository implements Entity130DatasourcePort, PanacheRepository<Entity130> {
    @Override
    public Optional<Model130> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
