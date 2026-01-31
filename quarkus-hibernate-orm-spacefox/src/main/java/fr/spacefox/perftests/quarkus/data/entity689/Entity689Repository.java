package fr.spacefox.perftests.quarkus.data.entity689;

import fr.spacefox.perftests.quarkus.core.port.data.Entity689DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service689.model.Model689;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity689Repository implements Entity689DatasourcePort, PanacheRepository<Entity689> {
    @Override
    public Optional<Model689> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
