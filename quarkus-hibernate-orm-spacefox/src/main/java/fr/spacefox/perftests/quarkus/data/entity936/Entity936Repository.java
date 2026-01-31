package fr.spacefox.perftests.quarkus.data.entity936;

import fr.spacefox.perftests.quarkus.core.port.data.Entity936DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service936.model.Model936;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity936Repository implements Entity936DatasourcePort, PanacheRepository<Entity936> {
    @Override
    public Optional<Model936> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
