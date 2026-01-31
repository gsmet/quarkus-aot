package fr.spacefox.perftests.quarkus.data.entity862;

import fr.spacefox.perftests.quarkus.core.port.data.Entity862DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service862.model.Model862;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity862Repository implements Entity862DatasourcePort, PanacheRepository<Entity862> {
    @Override
    public Optional<Model862> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
