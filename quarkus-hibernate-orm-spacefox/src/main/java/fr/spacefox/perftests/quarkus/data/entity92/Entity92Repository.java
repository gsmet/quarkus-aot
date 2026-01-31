package fr.spacefox.perftests.quarkus.data.entity92;

import fr.spacefox.perftests.quarkus.core.port.data.Entity92DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service92.model.Model92;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity92Repository implements Entity92DatasourcePort, PanacheRepository<Entity92> {
    @Override
    public Optional<Model92> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
