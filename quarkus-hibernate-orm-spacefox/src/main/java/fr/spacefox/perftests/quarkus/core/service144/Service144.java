package fr.spacefox.perftests.quarkus.core.service144;

import fr.spacefox.perftests.quarkus.core.port.data.Entity144DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service144.model.Model144;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service144 {

    private final Entity144DatasourcePort datasource;

    public Service144(Entity144DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model144 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
