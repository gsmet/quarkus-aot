package fr.spacefox.perftests.quarkus.data.entity434;

import fr.spacefox.perftests.quarkus.core.port.data.Entity434DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service434.model.Model434;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity434Repository implements Entity434DatasourcePort, PanacheRepository<Entity434> {
    @Override
    public Optional<Model434> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
