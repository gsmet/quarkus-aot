package fr.spacefox.perftests.quarkus.core.service936;

import fr.spacefox.perftests.quarkus.core.port.data.Entity936DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service936.model.Model936;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service936 {

    private final Entity936DatasourcePort datasource;

    public Service936(Entity936DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model936 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
