package fr.spacefox.perftests.quarkus.data.entity545;

import fr.spacefox.perftests.quarkus.core.port.data.Entity545DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service545.model.Model545;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity545Repository implements Entity545DatasourcePort, PanacheRepository<Entity545> {
    @Override
    public Optional<Model545> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
