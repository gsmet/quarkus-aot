package fr.spacefox.perftests.quarkus.data.entity357;

import fr.spacefox.perftests.quarkus.core.port.data.Entity357DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service357.model.Model357;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity357Repository implements Entity357DatasourcePort, PanacheRepository<Entity357> {
    @Override
    public Optional<Model357> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
