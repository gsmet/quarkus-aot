package fr.spacefox.perftests.quarkus.data.entity673;

import fr.spacefox.perftests.quarkus.core.port.data.Entity673DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service673.model.Model673;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity673Repository implements Entity673DatasourcePort, PanacheRepository<Entity673> {
    @Override
    public Optional<Model673> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
