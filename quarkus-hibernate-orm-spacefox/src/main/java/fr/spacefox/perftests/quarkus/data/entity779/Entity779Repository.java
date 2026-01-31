package fr.spacefox.perftests.quarkus.data.entity779;

import fr.spacefox.perftests.quarkus.core.port.data.Entity779DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service779.model.Model779;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity779Repository implements Entity779DatasourcePort, PanacheRepository<Entity779> {
    @Override
    public Optional<Model779> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
