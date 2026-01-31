package fr.spacefox.perftests.quarkus.core.service908;

import fr.spacefox.perftests.quarkus.core.port.data.Entity908DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service908.model.Model908;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service908 {

    private final Entity908DatasourcePort datasource;

    public Service908(Entity908DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model908 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
