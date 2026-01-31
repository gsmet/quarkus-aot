package fr.spacefox.perftests.quarkus.data.entity19;

import fr.spacefox.perftests.quarkus.core.port.data.Entity19DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service19.model.Model19;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity19Repository implements Entity19DatasourcePort, PanacheRepository<Entity19> {
    @Override
    public Optional<Model19> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
