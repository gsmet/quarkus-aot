package fr.spacefox.perftests.quarkus.data.entity994;

import fr.spacefox.perftests.quarkus.core.port.data.Entity994DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service994.model.Model994;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity994Repository implements Entity994DatasourcePort, PanacheRepository<Entity994> {
    @Override
    public Optional<Model994> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
