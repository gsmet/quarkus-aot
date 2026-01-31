package fr.spacefox.perftests.quarkus.data.entity863;

import fr.spacefox.perftests.quarkus.core.port.data.Entity863DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service863.model.Model863;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity863Repository implements Entity863DatasourcePort, PanacheRepository<Entity863> {
    @Override
    public Optional<Model863> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
