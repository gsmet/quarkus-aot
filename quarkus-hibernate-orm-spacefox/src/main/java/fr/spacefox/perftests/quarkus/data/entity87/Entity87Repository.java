package fr.spacefox.perftests.quarkus.data.entity87;

import fr.spacefox.perftests.quarkus.core.port.data.Entity87DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service87.model.Model87;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity87Repository implements Entity87DatasourcePort, PanacheRepository<Entity87> {
    @Override
    public Optional<Model87> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
