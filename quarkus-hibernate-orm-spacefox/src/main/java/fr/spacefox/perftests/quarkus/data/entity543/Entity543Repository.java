package fr.spacefox.perftests.quarkus.data.entity543;

import fr.spacefox.perftests.quarkus.core.port.data.Entity543DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service543.model.Model543;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity543Repository implements Entity543DatasourcePort, PanacheRepository<Entity543> {
    @Override
    public Optional<Model543> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
