package fr.spacefox.perftests.quarkus.data.entity307;

import fr.spacefox.perftests.quarkus.core.port.data.Entity307DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service307.model.Model307;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity307Repository implements Entity307DatasourcePort, PanacheRepository<Entity307> {
    @Override
    public Optional<Model307> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
