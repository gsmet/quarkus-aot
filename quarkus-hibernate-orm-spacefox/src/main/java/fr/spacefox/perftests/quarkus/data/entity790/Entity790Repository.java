package fr.spacefox.perftests.quarkus.data.entity790;

import fr.spacefox.perftests.quarkus.core.port.data.Entity790DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service790.model.Model790;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity790Repository implements Entity790DatasourcePort, PanacheRepository<Entity790> {
    @Override
    public Optional<Model790> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
