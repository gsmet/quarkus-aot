package fr.spacefox.perftests.quarkus.core.service330;

import fr.spacefox.perftests.quarkus.core.port.data.Entity330DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service330.model.Model330;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service330 {

    private final Entity330DatasourcePort datasource;

    public Service330(Entity330DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model330 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
