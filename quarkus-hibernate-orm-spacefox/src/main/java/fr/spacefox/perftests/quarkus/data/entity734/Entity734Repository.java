package fr.spacefox.perftests.quarkus.data.entity734;

import fr.spacefox.perftests.quarkus.core.port.data.Entity734DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service734.model.Model734;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity734Repository implements Entity734DatasourcePort, PanacheRepository<Entity734> {
    @Override
    public Optional<Model734> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
