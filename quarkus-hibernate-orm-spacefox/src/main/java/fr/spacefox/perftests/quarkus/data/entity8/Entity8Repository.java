package fr.spacefox.perftests.quarkus.data.entity8;

import fr.spacefox.perftests.quarkus.core.port.data.Entity8DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service8.model.Model8;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity8Repository implements Entity8DatasourcePort, PanacheRepository<Entity8> {
    @Override
    public Optional<Model8> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
