package fr.spacefox.perftests.quarkus.data.entity781;

import fr.spacefox.perftests.quarkus.core.port.data.Entity781DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service781.model.Model781;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity781Repository implements Entity781DatasourcePort, PanacheRepository<Entity781> {
    @Override
    public Optional<Model781> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
