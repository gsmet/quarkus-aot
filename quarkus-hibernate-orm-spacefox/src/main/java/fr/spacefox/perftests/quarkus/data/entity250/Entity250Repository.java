package fr.spacefox.perftests.quarkus.data.entity250;

import fr.spacefox.perftests.quarkus.core.port.data.Entity250DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service250.model.Model250;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity250Repository implements Entity250DatasourcePort, PanacheRepository<Entity250> {
    @Override
    public Optional<Model250> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
