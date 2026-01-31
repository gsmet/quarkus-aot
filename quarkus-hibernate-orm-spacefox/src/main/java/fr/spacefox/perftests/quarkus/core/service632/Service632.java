package fr.spacefox.perftests.quarkus.core.service632;

import fr.spacefox.perftests.quarkus.core.port.data.Entity632DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service632.model.Model632;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service632 {

    private final Entity632DatasourcePort datasource;

    public Service632(Entity632DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model632 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
