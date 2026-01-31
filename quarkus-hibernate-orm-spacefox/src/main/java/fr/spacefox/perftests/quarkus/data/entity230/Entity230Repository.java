package fr.spacefox.perftests.quarkus.data.entity230;

import fr.spacefox.perftests.quarkus.core.port.data.Entity230DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service230.model.Model230;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity230Repository implements Entity230DatasourcePort, PanacheRepository<Entity230> {
    @Override
    public Optional<Model230> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
